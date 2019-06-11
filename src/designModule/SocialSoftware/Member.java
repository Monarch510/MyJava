package designModule.SocialSoftware;

public class Member extends GroupComponent{
	
	public Member() {
		
	}
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public GroupComponent getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void add(GroupComponent groupComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(GroupComponent groupComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void share(GroupComponent groupComponent) {
		// TODO Auto-generated method stub
		System.out.println("share to " + groupComponent.name);
	}

}
