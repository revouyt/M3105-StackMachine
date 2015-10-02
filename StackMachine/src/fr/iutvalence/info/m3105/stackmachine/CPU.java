package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public class CPU implements InterfaceCPU
{

	private Object ioSystem;
	
	// TODO something is missing here...

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#run()
	 */
	@Override
	public void run()
	{
		try
		{
			while (true)
			{
				// TODO something is missing here...

				// System.err.print("@" + this.programCounter + ": ");
				switch (opCode)
				{
					case HALT:
					{
						// System.err.println("HALT");
						((IO) this.ioSystem).displayProgramTermination();
						return;
					}
					case PUSH:
					{
						// TODO something is missing here...
						break;
					}
					case ADD:
					{
						// TODO something is missing here...
						break;
					}
					case SUB:
					{
						// TODO something is missing here...
						break;
					}
					case MUL:
					{
						// TODO something is missing here...
						break;
					}
					case DIV:
					{
						// TODO something is missing here...
						break;
					}
					case MOD:
					{
						// TODO something is missing here...
						break;
					}
					case NEG:
					{
						// TODO something is missing here...
						break;
					}
					case LT:
					{
						// TODO something is missing here...
						break;
					}
					case LE:
					{
						// TODO something is missing here...
						break;
					}
					case GT:
					{
						// TODO something is missing here...
						break;
					}
					case GE:
					{
						// TODO something is missing here...
						break;
					}
					case EQ:
					{
						// TODO something is missing here...
						break;
					}
					case NE:
					{
						// TODO something is missing here...
						break;
					}
					case IN:
					{
						// TODO something is missing here...
						break;
					}
					case OUT:
					{
						// TODO something is missing here...
						break;
					}
					case CALL:
					{
						// TODO something is missing here...
						break;
					}
					case RET:
					{
						// TODO something is missing here...
						break;
					}
					case JP:
					{
						// TODO something is missing here...
						break;
					}
					case JZ:
					{
						// TODO something is missing here...
						break;
					}
					case DUP:
					{
						// TODO something is missing here...
						break;
					}
					case POP:
					{
						// TODO something is missing here...
						break;
					}
					default:
					{
						// TODO something is missing here...
						return;
					}
				}
			}
		}
		catch (AddressOutOfBoundsException e)
		{
			// TODO something is missing here...
		}
		catch (IOException e)
		{
			// TODO something is missing here...
		}
		catch (StackOverflowException e)
		{
			// TODO something is missing here...
		}
		catch (StackUnderflowException e)
		{
			// TODO something is missing here...
		}		
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#wireToProgramMemory(fr.iutvalence.info.m3105.stackmachine.Memory)
	 */
	@Override
	public void wireToProgramMemory(Memory programMemory) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#wireToExpStack(fr.iutvalence.info.m3105.stackmachine.Stack)
	 */
	@Override
	public void wireToExpStack(Stack expStack) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#wireToIoSubsystem(fr.iutvalence.info.m3105.stackmachine.IO)
	 */
	@Override
	public void wireToIoSubsystem(IO ioSystem) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#wireToCallStack(fr.iutvalence.info.m3105.stackmachine.Stack)
	 */
	@Override
	public void wireToCallStack(Stack callStack) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#clearStacks()
	 */
	@Override
	public void clearStacks() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.InterfaceCPU#setPC(int)
	 */
	@Override
	public void setPC(int address) {
		// TODO Auto-generated method stub
		
	}

	// TODO something is missing here...
}
