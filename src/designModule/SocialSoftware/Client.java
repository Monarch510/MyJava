package designModule.SocialSoftware;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupComposite groupComposite = new GroupComposite("Friend");
		groupComposite.add(new Member("wwj"));	
		groupComposite.add(new GroupComposite("Roommate"));
		groupComposite.getChild(1).add(new Member("zgm"));
		groupComposite.getChild(1).add(new Member("hky"));	
		groupComposite.getChild(1).add(new Member("lp"));
		groupComposite.share(groupComposite.getChild(0));
		groupComposite.share(groupComposite);
	}

}
