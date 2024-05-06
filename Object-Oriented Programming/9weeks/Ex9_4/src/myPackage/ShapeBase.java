package myPackage;

public abstract class ShapeBase implements ShapeInterface {
	private int offset;
	public abstract void drawHere();
	
	public void setOffset(int newOffset) {
		offset = newOffset;
	}
	public int getOffset() {
		return offset;
	}
	public void drawAt(int lineNumber){
		{
			for (int count = 0; count < lineNumber; count++)
				System.out.println();
			drawHere();
		}
	}
}
