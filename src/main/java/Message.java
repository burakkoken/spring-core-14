import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}
}
