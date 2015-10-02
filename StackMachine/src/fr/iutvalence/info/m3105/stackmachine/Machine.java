package fr.iutvalence.info.m3105.stackmachine;

public class Machine
{
	private InterfaceCPU cpu;
	private Memory programMemory;
	private Stack stack1;
	private Stack stack2;

	public Machine(InterfaceCPU cpu, Memory programMemory,Stack stack1,Stack stack2, Stack expStack, Stack callStack, IO ioSystem)
	{
		super();
		this.cpu = cpu;
		this.programMemory = programMemory;
		this.stack1 = stack1;
		this.stack2 = stack2;
		this.cpu.wireToProgramMemory(programMemory);
		this.cpu.wireToExpStack(expStack);
		this.cpu.wireToCallStack(callStack);
		this.cpu.wireToIoSubsystem(ioSystem);
	}

	public void loadProgram(Program program) throws AddressOutOfBoundsException
	{
		int currentAddress = this.programMemory.getStartAddress();

		for (int instructionNumber = 0; instructionNumber < program.getInstructionCount(); instructionNumber++)
		{
			Instruction instruction = program.getInstructionAt(instructionNumber);
			this.programMemory.write(currentAddress, instruction.getOpCode());
			currentAddress++;
			int[] instructionParams = instruction.getParams();
			if (instructionParams != null)
			{
				for (int instructionParam : instructionParams)
				{
					this.programMemory.write(currentAddress, instructionParam);
					currentAddress++;
				}
			}
		}
	}

	public void executeProgram(int address)
	{
		cpu.clearStacks();
		cpu.setPC(address);
		cpu.run();
		System.out.println("(end of program execution)");
	}

}
