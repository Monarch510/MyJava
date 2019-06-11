package designModule.SocialSoftware;

public abstract class GroupComponent {
	protected String name;
	
	public abstract void add(GroupComponent groupComposite);
	
	public abstract void remove(GroupComponent groupComposite);
	
	public abstract void share(GroupComponent groupComposite);
	
	public abstract GroupComponent getChild(int i);
	
	public abstract void setName(String name);
	
	public abstract String getName();

}
