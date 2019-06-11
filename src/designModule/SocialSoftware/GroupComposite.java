package designModule.SocialSoftware;

import java.util.ArrayList;

public class GroupComposite extends GroupComponent{
	private ArrayList<GroupComponent> list= new ArrayList<GroupComponent>();
	
	public GroupComposite() {
		
	}
	
	public GroupComposite(String name) {
		this.name = name;
	}

	@Override
	public GroupComponent getChild(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
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
	public void add(GroupComponent groupComposite) {
		// TODO Auto-generated method stub
		list.add(groupComposite);
		System.out.println("add " + groupComposite.name + " to " + this.name);
	}

	@Override
	public void remove(GroupComponent groupComponent) {
		// TODO Auto-generated method stub
		list.remove(groupComponent);
	}

	@Override
	public void share(GroupComponent groupComponent) {
		// TODO Auto-generated method stub
		if(groupComponent.getChild(0) == null) {
			groupComponent.share(groupComponent);
		}
		else {
			for(int i = 0;i < ((GroupComposite)groupComponent).list.size();i++) {
				this.share(groupComponent.getChild(i));
			}
		}
	}

}
