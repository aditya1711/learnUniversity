package humanResources;
import functions.*;
public interface Human extends DisplayConsole, WriteToFile {
	public String getName();
	public void setName(String s);
	public String getID();
	public void setID(String s);
}
