


			
			// 2D Moving Car
			// Author Tinsae Belay
			
			import javax.swing.*;
			import java.awt.*;
			import java.awt.event.*;
			
			public class Main extends Component implements ActionListener{
					
					JFrame window;
					
					
					
		// FRIST CAR
					int mainRectX = 0;
					int mainRectY = 0;
					int mainRectWidth =  50;
					int mainRectHeight =  30;
					
					
					int miniRectX = 50;
					int miniRectY = 15;
					int miniRectWidth = 10;
					int miniRectHeight = 15;
					
					int fristOvalX = 12;
					int fristOvalY = 27;
					int fristOvalWidth = 5;
					int fristOvalHeight = 5;
					
					int secondOvalX = 47;
					int secondOvalY = 27;
					int secondOvalWidth = 5;
					int secondOvalHeight = 5;

				// SECOND CAR
					int smainRectX = 1000;
					int smainRectY = 0;
					int smainRectWidth =  50;
					int smainRectHeight =  30;
					
					
					int sminiRectX = 990;
					int sminiRectY = 15;
					int sminiRectWidth = 10;
					int sminiRectHeight = 15;
					
					int sfristOvalX = 1000;
					int sfristOvalY = 27;
					int sfristOvalWidth = 5;
					int sfristOvalHeight = 5;
					
					int ssecondOvalX = 1035;
					int ssecondOvalY = 27;
					int ssecondOvalWidth = 5;
					int ssecondOvalHeight = 5;
					
					Color mainRectColor =  new Color( 0,162,232 );
					Color miniRectColor = Color.RED;
					Color treeColor = Color.GREEN;
					
					
					@Override
					public void paint(Graphics d){
						
						Graphics2D g = (Graphics2D) d;
						
						
						g.setColor( mainRectColor );
						g.fillRect( mainRectX,mainRectY,mainRectWidth,mainRectHeight );
						
						g.setColor( miniRectColor );
						g.fillRect( miniRectX,miniRectY,miniRectWidth,miniRectHeight );
					
						g.setColor( treeColor );
						g.fillOval( fristOvalX,fristOvalY,fristOvalWidth,fristOvalHeight);
						g.fillOval( secondOvalX,secondOvalY,secondOvalWidth,secondOvalHeight);
						
												
						
					}
					
					
					@Override
					public void actionPerformed(ActionEvent event){
								
								
			Graphics2D g = (Graphics2D) getGraphics();
						
						

						g.setColor( Color.BLACK );
						g.fillRect(0,0,1500,1000 );
						g.translate(100,100);					
			
			if( miniRectX >= sminiRectX  && 5<2 ){
				
				  g.setPaint( new GradientPaint( 0,20,Color.YELLOW,20,20,Color.RED,true ) );
				//g.setFont( new Font("Lusida console",Font.PLAIN,30) );
				//g.drawString( "Car Crashed",mainRectX,mainRectY);
				
				
				
				
				
				        //g.setColor( mainRectColor );
						g.fillRect( mainRectX,mainRectY+10,mainRectWidth,mainRectHeight+10 );
						
						//g.setColor( miniRectColor );
						g.fillRect( miniRectX,miniRectY+10,miniRectWidth,miniRectHeight+10 );
					
						//g.setColor( treeColor );
						g.fillOval( fristOvalX,fristOvalY+10,fristOvalWidth,fristOvalHeight+10);
						g.fillOval( secondOvalX,secondOvalY+10,secondOvalWidth,secondOvalHeight+10);
						
						
						
						
						/////////////
						
						// g.setColor( mainRectColor );
						g.fillRect( smainRectX,smainRectY,smainRectWidth,smainRectHeight );
						
					//	g.setColor( miniRectColor );
						g.fillRect( sminiRectX,sminiRectY,sminiRectWidth,sminiRectHeight );
					
					//	g.setColor( treeColor );
						g.fillOval( sfristOvalX,sfristOvalY,sfristOvalWidth,sfristOvalHeight);
						g.fillOval( ssecondOvalX,ssecondOvalY,ssecondOvalWidth,ssecondOvalHeight);
						
				
				
				
			}

					else{
								mainRectX+=5;
								miniRectX+=5;
								fristOvalX+=5;
								secondOvalX+=5;
								
								if(smainRectX + smainRectWidth <=0 ){
									
								smainRectX=1000;
								sminiRectX=990;
								sfristOvalX=1000;
								ssecondOvalX=1035;
									
								}
								
								else{
								
								smainRectX-=5;
								sminiRectX-=5;
								sfristOvalX-=5;
								ssecondOvalX-=5;
									
									}
								
						g.setColor( mainRectColor );
						g.fillRect( mainRectX,mainRectY,mainRectWidth,mainRectHeight );
						
						g.setColor( miniRectColor );
						g.fillRect( miniRectX,miniRectY,miniRectWidth,miniRectHeight );
					
						g.setColor( treeColor );
						g.fillOval( fristOvalX,fristOvalY,fristOvalWidth,fristOvalHeight);
						g.fillOval( secondOvalX,secondOvalY,secondOvalWidth,secondOvalHeight);

						
						/////////////
						
						g.setColor( mainRectColor );
						g.fillRect( smainRectX,smainRectY,smainRectWidth,smainRectHeight );
						
						g.setColor( miniRectColor );
						g.fillRect( sminiRectX,sminiRectY,sminiRectWidth,sminiRectHeight );
					
						g.setColor( treeColor );
						g.fillOval( sfristOvalX,sfristOvalY,sfristOvalWidth,sfristOvalHeight);
						g.fillOval( ssecondOvalX,ssecondOvalY,ssecondOvalWidth,ssecondOvalHeight);
						
					}
					
				}
							

					
					public Main(){
						
						window = new JFrame("Moving car by Tinsae");
						
						window.add( this );
						window.setSize( 1000,700 );
						window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
						window.setVisible( true );
						
					}
				
					public static void main(String[] ddd){
						
						
						Main m = new Main();
						
						Timer t = new Timer(100,m);
						t.start();
					}
				
			}
	