/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batallanavalterminado2;
import java.util.Scanner;
/**
 *
 * @author ANTONIO
 */
public class Batallanavalterminado2 {
static int tablero1[][],tablero2[][];
static int tamaño,disparox,disparoy,disparox2,disparoy2;
static String player1,player2;
static Scanner ok = new Scanner (System.in);

    public static void main(String[] args) {
       //TABLERO DE JUEGO
      System.out.println("=========INGRESE LA DIMENSION DE LADO DEL TABLERO==========");
      tamaño =ok.nextInt();
      tablero1=new int [tamaño][tamaño];
      tablero2 = new int[tamaño][tamaño];
      
       for(int x=0;x<tamaño;x++){
           for (int y=0;y<tamaño;y++){
               tablero1[x][y]=0;    
           }
       }
       
        for(int x=0;x<tamaño;x++){
           for (int y=0;y<tamaño;y++){
               tablero2[x][y]=0;
           }
       }
        //JUEGO
        //VARIABLE DE NOMBRES
        System.out.println("==========INGRESE NOMBRE DEL JUGADOR 1==========");
        player1=ok.next();
        System.out.println("==========INGRESE NOMBRE DEL JUGADOR 2==========");
        player2=ok.next();
            jugador1();
            jugador2();
            ataque();
    }

        public static  void jugador1(){
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("========="+player1+" COLOCA TU FLOTA==========");
            String vh;
            
            //BARCO TAMAÑO 1
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X1 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-1){
                        for(int x=0;x<1;x++){
                            tablero1[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-1 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<1;x++){
                            tablero1[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
            //BARCO TAMAÑO 2
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X2 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-2)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-2){
                        for(int x=0;x<2;x++){
                            tablero1[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-2)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-2 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<2;x++){
                            tablero1[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
            //BARCO TAMAÑO 3
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X3 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-3)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-3){
                        for(int x=0;x<3;x++){
                            tablero1[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-3)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-3 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<3;x++){
                            tablero1[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
                        //BARCO TAMAÑO 4
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X4 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-4)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-4){
                        for(int x=0;x<4;x++){
                            tablero1[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-4)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-4 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<4;x++){
                            tablero1[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero1[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
        }
        
        //FLOTA DE JUGADOR 2
        public static  void jugador2(){
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("========="+player2+" COLOCA TU FLOTA==========");
            String vh;
            
            //BARCO TAMAÑO 1
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X1 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-1){
                        for(int x=0;x<1;x++){
                            tablero2[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-1 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<1;x++){
                            tablero2[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
            //BARCO TAMAÑO 2
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X2 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-2)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-2){
                        for(int x=0;x<2;x++){
                            tablero2[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-2)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-2 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<2;x++){
                            tablero2[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
            //BARCO TAMAÑO 3
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X3 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-3)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-3){
                        for(int x=0;x<3;x++){
                            tablero2[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-3)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-3 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<3;x++){
                            tablero2[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
                        //BARCO TAMAÑO 4
            System.out.println("=========ELIJA LA ORIENTACION DEL BARCO 1X4 VERTICAL (V) U HORIZONTAL (H)==========");
            vh=ok.next();
            switch(vh){
                case"H":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-1)+")=========");
                    int posxh=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-4)+")==========");
                    int posyh=ok.nextInt();
                    System.out.println("\n");
                    if(posxh>=0 && posxh<=tamaño && posyh>=0 && posyh<=tamaño-4){
                        for(int x=0;x<4;x++){
                            tablero2[posxh][posyh+x]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
                    
                case"V":
                    System.out.println("=========COORDENADA VERTICAL (ENTRE 0 Y "+(tamaño-4)+")=========");
                    int posxv=ok.nextInt();
                    System.out.println("==========COORDENADA HORIZONTAL (ENTRE 0 Y "+(tamaño-1)+")==========");
                    int posyv=ok.nextInt();
                    System.out.println("\n");
                    if(posxv>=0 && posxv<=tamaño-4 && posyv>=0 && posyv<=tamaño){
                        for(int x=0;x<4;x++){
                            tablero2[posxv+x][posyv]=5;}
                        
                        for(int y=0;y<tamaño;y++){
                            for(int w=0;w<tamaño;w++){
                                System.out.print(tablero2[y][w]+" ");
                            }
                            System.out.println(" ");
                        }
                    }
                    System.out.println("\n");
                    break;
            }
            
        }
        
        public static void ataque(){
            for(int x=0;x<tablero1.length;x++)
                for (int y=0;y<tablero1.length-1;y++) 
            for(int w=0;w<tablero2.length;w++)
                for(int z=0;z<tablero2.length-1;z++)
                        while(tablero1[x][y]==5 && tablero2[w][z]==5 ){
                              
                             //ATAQUE JUGADOR 1 
                              System.out.println("==========TURNO DE: "+player1+"=========");
                              System.out.println("=========DISPARO EN EJE X ENTRE 0 Y "+tamaño+"==========");
                              disparoy=ok.nextInt();
                              System.out.println("=========DISPARO EN EJE Y ENTRE 0 Y "+tamaño+"==========");
                              disparox=ok.nextInt();
                              System.out.println("\n");
                              if(disparoy>=0 && disparoy<=tamaño && disparox>=0 && disparox<=tamaño){
                                  if(tablero2[disparox][disparoy]==5){
                                      System.out.println("=========DISPARO ACERTADO=========");
                                      System.out.println("\n\n");
                                      for(int h =0;h<tamaño;h++){
                                          for(int t=0;t<tamaño; t++){
                                              tablero2[disparox][disparoy]=1;
                                          }
                                      }
                                  }
                                  else
                                    if(tablero2[disparox][disparoy]==0){
                                      System.out.println("=============FALLASTE============");
                                      System.out.println("\n\n");
                                      for(int h =0;h<tamaño;h++){
                                          for(int t=0;t<tamaño; t++){
                                              tablero2[disparox][disparoy]=1;
                                          }
                                      }
                                  }
                                  else
                                    if(tablero2[disparox][disparoy]==1){
                                      System.out.println("=========DISPARO REPETIDO==========");
                                      System.out.println("\n\n");
                                  }
                                  
                             //ATAQUE JUGADOR 2
                              System.out.println("========TURNO DE: " + player2+"==========");
                              System.out.println("=========DISPARO EN EJE X ENTRE 0 Y "+tamaño+"==========");
                              disparoy2=ok.nextInt();
                              System.out.println("=========DISPARO EN EJE Y ENTRE 0 Y "+tamaño+"==========");
                              disparox2=ok.nextInt();
                              System.out.println("\n");
                              if(disparoy2>=0 && disparoy2<=tamaño && disparox2>=0 && disparox2<=tamaño){
                                  if(tablero1[disparox2][disparoy2]==5){
                                      System.out.println("=========DISPARO ACERTADO=========");
                                      System.out.println("\n\n");
                                      for(int h =0;h<tamaño;h++){
                                          for(int t=0;t<tamaño; t++){
                                              tablero1[disparox2][disparoy2]=1;
                                          }
                                      }
                                  }
                                  else
                                    if(tablero1[disparox2][disparoy2]==0){
                                      System.out.println("=============FALLASTE============");
                                      System.out.println("\n\n");
                                      for(int h =0;h<tamaño;h++){
                                          for(int t=0;t<tamaño; t++){
                                              tablero1[disparox2][disparoy2]=1;
                                          }
                                      }
                                  }
                                  else
                                    if(tablero1[disparox2][disparoy2]==1){
                                      System.out.println("=========DISPARO REPETIDO==========");
                                      System.out.println("\n\n");
                                  }
                              } 
                          }
               }
           
           //RECUENTO PARA VICTORIA/DERROTA
            for(int x=0;x<tablero1.length;x++)
                for (int y=0;y<tablero1.length-1;y++)
            for(int w=0;w<tablero1.length;w++)
                for(int z=0;z<tablero1.length-1;z++)
                    if (tablero1 [x][y]==0&&tablero1[w][z]==5){
                            System.out.println("=========="+player2+ " PERDIO===========");
                            System.out.println("==========VICTORIA DE: "+ player1+"==========");
                            break;
                        }
            for(int x=0;x<tablero2.length;x++)
                for (int y=0;y<tablero2.length-1;y++)
            for(int w=0;w<tablero2.length;w++)
                for(int z=0;z<tablero2.length-1;z++)
                    if (tablero2 [x][y]==0&&tablero2[w][z]==5){
                            System.out.println("=========="+player1+ " PERDIO===========");
                            System.out.println("==========VICTORIA DE: "+ player2+"==========");
                            break;
                          }
        }
}
