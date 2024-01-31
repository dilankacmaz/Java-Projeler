 import java.util.Scanner;

public class _21010310033_decoder extends _21010310033_DosyaOku{

	public static String[] dosya;

	 public static void buyruk(String[]dosya) throws InterruptedException {
		    String array = null;
			String array1 = null ;
			String array2 = null;
			String array3 = null;
			String aktif = null;
			
			for(int i=0;i<dosya.length;i++) {
				
				System.out.print ("T" + i + " zamanýnda ");
				String ilk=dosya[i].substring(0,1);
				if(ilk.equals("0")) {
					System.out.print(" I=0 ");
				}
				else {
					System.out.print(" I=1 ");
				}
				
				
					String aktiflik=dosya[i].substring(1,4);
					
					
					if(aktiflik.equals("000")) {
						aktif="D0 aktif";
					}
					else if(aktiflik.equals("001")) {
						aktif="D1 aktif";
					}
					else if(aktiflik.equals("010")) {
						aktif="D2 aktif";
					}
					else if(aktiflik.equals("011")) {
						aktif="D3 aktif";
					}
					else if(aktiflik.equals("100")) {
						aktif="D4 aktif";
					}
					else if(aktiflik.equals("101")) {
						aktif="D5 aktif";
					}
					else if(aktiflik.equals("110")) {
						aktif="D6 aktif";
					}
					else if(aktiflik.equals("111")) {
						aktif="D7 aktif";
					}
					
				
					System.out.print(aktif);
				
				
					
				    String register=dosya[i].substring(4,16);
					System.out.print(" IR(11-0) = "+register);
				  
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		    String dizi=dosya[i].substring(0,4);
		    if(dizi.equals("0000")) {
				array="0";
			}
			else if(dizi.equals("0001")) {
				array="1";
			}
			else if(dizi.equals("0010")) {
				array="2";
			}
			else if(dizi.equals("0011")) {
				array="3";
			}
			else if(dizi.equals("0100")) {
				array="4";
			}
			else if(dizi.equals("0101")) {
				array="5";
			}
			else if(dizi.equals("0110")) {
				array="6";
			}
			else if(dizi.equals("0111")) {
				array="7";
			}
			else if(dizi.equals("1000")) {
				array="8";
			}
			else if(dizi.equals("1001")) {
				array="9";
			}
			else if(dizi.equals("1010")) {
				array="A";
			}
			else if(dizi.equals("1011")) {
				array="B";
			}
			else if(dizi.equals("1100")) {
				array="C";
			}
			else if(dizi.equals("1101")) {
				array="D";
			}
			else if(dizi.equals("1110")) {
				array="E";
			}
			else if(dizi.equals("1111")) {
				array="F";
			}
				
				
				
				
				
				
				
			String dizi1=dosya[i].substring(4,8);
			
			
			if(dizi1.equals("0000")) {
				array1="0";
			}
			else if(dizi1.equals("0001")) {
				array1="1";
			}
			else if(dizi1.equals("0010")) {
				array1="2";
			}
			else if(dizi1.equals("0011")) {
				array1="3";
			}
			else if(dizi1.equals("0100")) {
				array1="4";
			}
			else if(dizi1.equals("0101")) {
				array1="5";
			}
			else if(dizi1.equals("0110")) {
				array1="6";
			}
			else if(dizi1.equals("0111")) {
				array1="7";
			}
			else if(dizi1.equals("1000")) {
				array1="8";
			}
			else if(dizi1.equals("1001")) {
				array1="9";
			}
			else if(dizi1.equals("1010")) {
				array1="A";
			}
			else if(dizi1.equals("1011")) {
				array1="B";
			}
			else if(dizi1.equals("1100")) {
				array1="C";
			}
			else if(dizi1.equals("1101")) {
				array1="D";
			}
			else if(dizi1.equals("1110")) {
				array1="E";
			}
			else if(dizi1.equals("1111")) {
				array1="F";
			}
			
			
			
				String dizi2=dosya[i].substring(8,12);
			
				
				if(dizi2.equals("0000")) {
					array2="0";
				}
				else if(dizi2.equals("0001")) {
					array2="1";
				}
				else if(dizi2.equals("0010")) {
					array2="2";
				}
				else if(dizi2.equals("0011")) {
					array2="3";
				}
				else if(dizi2.equals("0100")) {
					array2="4";
				}
				else if(dizi2.equals("0101")) {
					array2="5";
				}
				else if(dizi2.equals("0110")) {
					array2="6";
				}
				else if(dizi2.equals("0111")) {
					array2="7";
				}
				else if(dizi2.equals("1000")) {
					array2="8";
				}
				else if(dizi2.equals("1001")) {
					array2="9";
				}
				else if(dizi2.equals("1010")) {
					array2="A";
				}
				else if(dizi2.equals("1011")) {
					array2="B";
				}
				else if(dizi2.equals("1100")) {
					array2="C";
				}
				else if(dizi2.equals("1101")) {
					array2="D";
				}
				else if(dizi2.equals("1110")) {
					array2="E";
				}
				else if(dizi2.equals("1111")) {
					array2="F";
				}
				
				
				
				
				
					String dizi3=dosya[i].substring(12,16);
					
					
					if(dizi3.equals("0000")) {
						array3="0";
					}
					else if(dizi3.equals("0001")) {
						array3="1";
					}
					else if(dizi3.equals("0010")) {
						array3="2";
					}
					else if(dizi3.equals("0011")) {
						array3="3";
					}
					else if(dizi3.equals("0100")) {
						array3="4";
					}
					else if(dizi3.equals("0101")) {
						array3="5";
					}
					else if(dizi3.equals("0110")) {
						array3="6";
					}
					else if(dizi3.equals("0111")) {
						array3="7";
					}
					else if(dizi3.equals("1000")) {
						array3="8";
					}
					else if(dizi3.equals("1001")) {
						array3="9";
					}
					else if(dizi3.equals("1010")) {
						array3="A";
					}
					else if(dizi3.equals("1011")) {
						array3="B";
					}
					else if(dizi3.equals("1100")) {
						array3="C";
					}
					else if(dizi3.equals("1101")) {
						array3="D";
					}
					else if(dizi3.equals("1110")) {
						array3="E";
					}
					else if(dizi3.equals("1111")) {
						array3="F";
					}
			String bas=dosya[i].substring(0,1);
			String buyruk = array+array1+array2+array3;
			
			if((array.equals("0") && bas.equals("0")) || (array.equals("8") && bas.equals("1")) ) {
				System.out.println(" buyruk = AND");
			}
			else if(array.equals("1") && bas.equals("0") || (array.equals("9") && bas.equals("1"))) {
				System.out.println(" buyruk = ADD");
			}
			else if(array.equals("2") && bas.equals("0") || (array.equals("A") && bas.equals("1"))) {
				System.out.println(" buyruk = LDA");
			}
			else if(array.equals("3") && bas.equals("0") || (array.equals("B") && bas.equals("1"))) {
				System.out.println(" buyruk = STA");
			}
			else if(array.equals("4") && bas.equals("0") || (array.equals("C") && bas.equals("1"))) {
				System.out.println(" buyruk = BUN");
			}
			else if(array.equals("5") && bas.equals("0") || (array.equals("D") && bas.equals("1"))) {
				System.out.println(" buyruk = BSA");
			}
			else if(array.equals("6") && bas.equals("0") || (array.equals("E") && bas.equals("1"))) {
				System.out.println(" buyruk = ISZ");
			}
		
			
			 if(buyruk.equals("7800")) {
				   System.out.println(" buyruk = CLA");
			   }
			   else if(buyruk.equals("7400")){
				   System.out.println(" buyruk = CLE");
			   }
			   else if(buyruk.equals("7200")) {
				   System.out.println(" buyruk = CMA");
			   }
			   else if(buyruk.equals("7100")) {
				   System.out.println(" buyruk = CME");
			   }
			   else if(buyruk.equals("7080")) {
				   System.out.println(" buyruk = CIR");
			   }
			   else if(buyruk.equals("7040")) {
				   System.out.println(" buyruk = CIL");
			   }
			   else if(buyruk.equals("7020")) {
				   System.out.println(" buyruk = INC");
			   }
			   else if(buyruk.equals("7010")) {
				   System.out.println(" buyruk = SPA");
			   }
			   else if(buyruk.equals("7008")) {
				   System.out.println(" buyruk = SNA");
			   }
			   else if(buyruk.equals("7004")) {
				   System.out.println(" buyruk = SZA");
			   }
			   else if(buyruk.equals("7002")) {
				   System.out.println(" buyruk = SZE");
			   }
			   else if(buyruk.equals("7001")) {
				   System.out.println(" buyruk = HLT");
			   }
			   else if(buyruk.equals("F800")) {
				   System.out.println(" buyruk = INP");
			   }
			   else if(buyruk.equals("F400")) {
				   System.out.println(" buyruk = OUT");
			   }
			   else if(buyruk.equals("F200")) {
				   System.out.println(" buyruk = SKI");
			   }
			   else if(buyruk.equals("F100")) {
				   System.out.println(" buyruk = SKO");
			   }
			   else if(buyruk.equals("F080")) {
				   System.out.println(" buyruk = ION");
			   }
			   else if(buyruk.equals("F040")) {
				   System.out.println(" buyruk = IOF");
			   }
			
			 Thread.sleep(1000);
			}
	   }
}
