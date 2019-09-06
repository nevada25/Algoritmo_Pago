 
package prueba;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BillToPay2 {
    
    public static List<Double> getBillAll(Double valor, int cantidad) {
        int length = 5;
        double[] series = new double[length];
        series[0] = 10;
        series[1] = 20;
        series[2] = 50;
        series[3] = 100;
        series[4] = 200;
        double valorapagar = valor;
        List<Double> chequesapagar = new ArrayList<Double>();
        List<Double> chequesapagarFinal = new ArrayList<Double>();
        for (int i = 0; i < series.length; i++) {
            if (valorapagar > 0 && valorapagar < series[0]) {
                chequesapagar.add(series[0]);
            }
            if (valorapagar > 10 && valorapagar < series[1]) {
                Double salida = series[1];
                Double salida2 = series[1] + series[1];
                if (valorapagar > series[1]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[1]) {
                    if (valorapagar > salida) {
                        chequesapagar.add(salida);
                    }
                    if (valorapagar > salida2) {
                        chequesapagar.add(salida2);
                    }
                }

            }
            if (valorapagar > 20 && valorapagar < series[2]) {
                Double salida = series[0] + series[1];
                Double salida2 = series[0] + series[0];
                Double salida3 = series[1] + series[1];
                if (valorapagar > series[2]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[2]) {
                    if (salida > valorapagar) {
                        chequesapagar.add(salida);
                    }
                    if (salida2 > valorapagar) {
                        chequesapagar.add(salida2);
                    }
                    if (salida3 > valorapagar) {
                        chequesapagar.add(salida3);
                    }
                }

            }
            if (valorapagar > 50 && valorapagar < series[3]) {
                Double salida = series[0] + series[1];
                Double salida2 = series[0] + series[2];
                Double salida3 = series[1] + series[2];
                Double salida4 = series[0] + series[0];
                Double salida5 = series[1] + series[1];
                Double salida6 = series[2] + series[2];
                Double salida7 = series[0] + series[1] + series[2];
                Double salida8 = salida6 + salida6;
                System.out.println("salida: " + salida);
                System.out.println("salida2: " + salida2);
                System.out.println("salida3: " + salida3);
                System.out.println("salida4: " + salida4);
                System.out.println("salida5: " + salida5);
                System.out.println("salida6: " + salida6);
                System.out.println("salida7: " + salida7);
                System.out.println("salida8: " + salida8);
                if (valorapagar > series[3]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[3]) {
                    if (salida > valorapagar) {
                        chequesapagar.add(salida);
                    }
                    if (salida2 > valorapagar) {
                        chequesapagar.add(salida2);
                    }
                    if (salida3 > valorapagar) {
                        chequesapagar.add(salida3);
                    }
                    if (salida4 > valorapagar) {
                        chequesapagar.add(salida4);
                    }
                    if (salida5 > valorapagar) {
                        chequesapagar.add(salida5);
                    }
                    if (salida6 > valorapagar) {
                        chequesapagar.add(salida6);
                    }
                    if (salida7 > valorapagar) { 
                        if (valorapagar > salida3) {
                            chequesapagar.add(salida7);
                        }
                    }
                    if (salida8 > valorapagar) {
                        
                            chequesapagar.add(salida8);
                      

                    }
                }
                break;
            }
            if (valorapagar > 100 && valorapagar < series[4]) {

                Double salida = series[0] + series[0] + series[0];
                Double salida1 = series[0] + series[0] + series[1];
                Double salida2 = series[0] + series[0] + series[2];
                Double salida3 = series[0] + series[0] + series[3];
                Double salida4 = series[0] + series[1] + series[1];
                Double salida5 = series[0] + series[1] + series[2];
                Double salida6 = series[0] + series[1] + series[3];
                Double salida7 = series[0] + series[2] + series[2];
                Double salida8 = series[0] + series[2] + series[3];
                Double salida9 = series[0] + series[3] + series[3];
                Double salida10 = series[1] + series[1] + series[1];
                Double salida11 = series[1] + series[1] + series[2];
                Double salida12 = series[1] + series[1] + series[3];
                Double salida13 = series[1] + series[2] + series[2];
                Double salida14 = series[1] + series[2] + series[3];
                Double salida15 = series[1] + series[3] + series[3];
                Double salida16 = series[2] + series[2] + series[2];
                Double salida17 = series[2] + series[3] + series[3];
                Double salida18 = series[3] + series[3] + series[3];
                Double salida19 = series[0] + series[1] + series[2] + series[3];

                System.out.println("salida: " + salida);
                System.out.println("salida1: " + salida1);
                System.out.println("salida2: " + salida2);
                System.out.println("salida3: " + salida3);
                System.out.println("salida4: " + salida4);
                System.out.println("salida5: " + salida5);
                System.out.println("salida6: " + salida6);
                System.out.println("salida7: " + salida7);
                System.out.println("salida8: " + salida8);
                System.out.println("salida9: " + salida9);
                System.out.println("salida10: " + salida10);
                System.out.println("salida11: " + salida11);
                System.out.println("salida12: " + salida12);
                System.out.println("salida13: " + salida13);
                System.out.println("salida14: " + salida14);
                System.out.println("salida15: " + salida15);
                System.out.println("salida16: " + salida16);
                System.out.println("salida17: " + salida17);
                System.out.println("salida18: " + salida18);
                if (valorapagar > series[4]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[4]) {
                    if (valorapagar < salida) {
                        if (salida <= series[4]) {
                            chequesapagar.add(salida);
                        }

                    }
                    if (valorapagar < salida1) {
                        if (salida1 <= series[4]) {
                            chequesapagar.add(salida1);
                        }
                    }
                    if (valorapagar < salida2) {
                        if (salida2 <= series[4]) {
                            chequesapagar.add(salida2);
                        }
                    }
                    if (valorapagar < salida3) {
                        if (salida3 <= series[4]) {
                            chequesapagar.add(salida3);
                        }
                    }
                    if (valorapagar < salida4) {
                        if (salida4 <= series[4]) {
                            chequesapagar.add(salida4);
                        }
                    }
                    if (valorapagar < salida5) {
                        if (salida5 <= series[4]) {
                            chequesapagar.add(salida5);
                        }
                    }
                    if (valorapagar < salida6) {
                        if (salida6 <= series[4]) {
                            if (valorapagar > salida3) {
                                chequesapagar.add(salida6);
                            }

                        }
                    }
                    if (valorapagar < salida7) {
                        if (salida7 <= series[4]) {
                            chequesapagar.add(salida7);
                        }
                    }
                    if (valorapagar < salida8) {
                        if (salida8 <= series[4]) {
                            if (valorapagar > salida16) {
                                chequesapagar.add(salida8);
                            }
                        }
                    }
                    if (valorapagar < salida9) {
                        if (salida9 <= series[4]) {
                            chequesapagar.add(salida9);
                        }
                    }
                    if (valorapagar < salida10) {
                        if (salida10 <= series[4]) {
                            chequesapagar.add(salida10);
                        }
                    }
                    if (valorapagar < salida11) {
                        if (salida11 <= series[4]) {
                            chequesapagar.add(salida11);
                        }
                    }
                    if (valorapagar < salida12) {
                        if (salida12 <= series[4]) {
                            if (valorapagar > salida13) {
                                chequesapagar.add(salida12);
                            }
                        }
                    }
                    
                    if (valorapagar < salida13) {
                        if (salida13 <= series[4]) {
                            chequesapagar.add(salida13);
                        }
                    }
                    if (valorapagar < salida14) {
                        if (salida14 <= series[4]) {
                            if (valorapagar > salida16) {
                                chequesapagar.add(salida14);
                            }
                        }
                    }
                    if (valorapagar < salida15) {
                        if (salida15 <= series[4]) {
                            chequesapagar.add(salida15);
                        }
                    }
                    if (valorapagar < salida16) {
                        if (salida16 <= series[4]) {
                            chequesapagar.add(salida16);
                        }
                    }
                    if (valorapagar < salida17) {
                        if (salida17 <= series[4]) {
                            chequesapagar.add(salida17);
                        }
                    }
                    if (valorapagar < salida18) {
                        if (salida18 <= series[4]) {
                            chequesapagar.add(salida18);
                        }
                    }
                    if (valorapagar < salida19) {
                        if (salida19 <= series[4]) {
                            if (valorapagar > salida14) {
                                chequesapagar.add(salida19);
                            }
                        }
                    }
                    chequesapagar.add(200.0);
                    break;
                }

            }
            if (series[i] > valorapagar) {
                chequesapagar.add(series[i]);
            }

        }
        chequesapagar.add(valorapagar);
        chequesapagar = chequesapagar.stream().distinct().collect(Collectors.toList());
        Collections.sort(chequesapagar);
        if (chequesapagar.size() > cantidad) {
            for (int s = 0; s < cantidad; s++) {
                chequesapagarFinal.add(chequesapagar.get(s));
            }
        } else {
            for (int s = 0; s < chequesapagar.size(); s++) {
                chequesapagarFinal.add(chequesapagar.get(s));
            }
        }
        return chequesapagarFinal;
    }

}
