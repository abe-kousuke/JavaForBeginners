
public class RectIf extends MyFrame{
	public void run() {
		int x = 30;
		fillRect(x,80,10,100);
		int i;
		for(i = 0; i < 10; i++) {
			if(i==0) {
				fillRect(x,80,10,100);
				setColor(0,0,0);
			  }
			    else if(i==1) {
			    fillRect(x,80,10,100);
			    setColor(15,15,15);
			  }
			    else if(i==2) {
			    fillRect(x,80,10,100);
			    setColor(30,30,30);
			  }
			    else if(i==3) {
			    fillRect(x,80,10,100);
			    setColor(45,45,45);
			  }
			    else if(i==4) {
			    fillRect(x,80,10,100);
			    setColor(60,60,60);
			  }
			    else if(i==5) {
			    fillRect(x,80,10,100);
			    setColor(75,75,75);
			  }
			    else if(i==6) {
			    fillRect(x,80,10,100);
			    setColor(90,90,90);
			  }
			    else if(i==7) {
			    fillRect(x,80,10,100);
			    setColor(105,105,105);
			  }
			    else if(i==8) {
			    fillRect(x,80,10,100);
			    setColor(130,130,130);
			  }
			    else {
			    fillRect(x,80,10,100);
			    setColor(0,128,0);
			  }
			x += 20;
		}
	}

}
