/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BillToPay {

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
                Double veinte = series[1];
                if (valorapagar > series[1]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[1]) {
                    if (valorapagar > veinte) {
                        chequesapagar.add(veinte);
                    }
                }

            }
            if (valorapagar > 20 && valorapagar < series[2]) {
                Double veinte = series[0] + series[0];
                Double treinta = series[0] + series[1];
                Double cuarenta = series[1] + series[1];
                if (valorapagar > series[2]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[2]) {
                    if (veinte > valorapagar) {
                        chequesapagar.add(veinte);
                    }
                    if (treinta > valorapagar) {
                        chequesapagar.add(treinta);
                    }
                    if (cuarenta > valorapagar) {
                        chequesapagar.add(cuarenta);
                    }
                }

            }
            if (valorapagar > 50 && valorapagar < series[3]) {
                Double sesenta = series[0] + series[2];
                Double setenta = series[1] + series[2];
                Double ochenta = series[0] + series[1] + series[2];
                Double noventa = series[1] + series[1] + series[2];
                Double cien = series[3];
                Double dociento = series[3] + series[3];

                if (valorapagar > series[3]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[3]) {
                    if (sesenta > valorapagar) {
                        chequesapagar.add(sesenta);
                    }
                    if (setenta > valorapagar) {
                        chequesapagar.add(setenta);
                    }
                    if (ochenta > valorapagar) {
                        if (valorapagar > setenta) {
                            chequesapagar.add(ochenta);
                        }
                    }
                    if (noventa > valorapagar) {
                        if (valorapagar > ochenta||valorapagar > setenta) {
                            chequesapagar.add(noventa);
                        }
                    }
                    if (cien > valorapagar) {
                        chequesapagar.add(cien);
                    }
                    if (dociento > valorapagar) {
                        chequesapagar.add(dociento);
                    }

                }
                break;
            }
            if (valorapagar > 100 && valorapagar < series[4]) {
                Double cien = series[3];
                Double cientodiez = series[0] + series[3];
                Double cientoveinte = series[1] + series[3];
                Double cientotreinta = series[0] + series[1] + series[3];
                Double cientocuarenta = series[1] + series[1] + series[3];
                Double cientocincuenta = series[2] + series[3];
                Double cientosesenta = series[0] + series[2] + series[3];
                Double cientosetenta = series[1] + series[2] + series[3];
                Double cientoochenta = series[3] + series[2] + series[1] + series[0];
                Double cientonoventa = series[3] + series[2] + series[1] + series[1];
                Double dociento = series[4];

                if (valorapagar > series[4]) {
                    chequesapagar.add(series[i]);
                } else if (valorapagar < series[4]) {
                    if (valorapagar < cien) {
                        if (cien <= series[4]) {
                            chequesapagar.add(cien);
                        }

                    }
                    if (valorapagar < cientodiez) {
                        if (cientodiez <= series[4]) {
                            chequesapagar.add(cientodiez);
                        }
                    }
                    if (valorapagar < cientoveinte) {
                        if (cientoveinte <= series[4]) {
                            chequesapagar.add(cientoveinte);
                        }
                    }
                    if (valorapagar < cientotreinta) {
                        if (cientotreinta <= series[4]) {
                            if (valorapagar > cientoveinte) {
                                chequesapagar.add(cientotreinta);
                            }

                        }
                    }
                    if (valorapagar < cientocuarenta) {
                        if (cientocuarenta <= series[4]) {
                            if (valorapagar > cientoveinte) {
                                chequesapagar.add(cientocuarenta);
                            }
                        }
                    }
                    if (valorapagar < cientocincuenta) {
                        if (cientocincuenta <= series[4]) {
                            chequesapagar.add(cientocincuenta);
                        }
                    }
                    if (valorapagar < cientosesenta) {
                        if (cientosesenta <= series[4]) {
                            if (valorapagar > cientocincuenta) {
                                chequesapagar.add(cientosesenta);
                            }

                        }
                    }
                    if (valorapagar < cientosetenta) {
                        if (cientosetenta <= series[4]) {
                            if (valorapagar > cientocincuenta) {
                                chequesapagar.add(cientosetenta);
                            }
                        }
                    }
                    if (valorapagar < cientoochenta) {
                        if (cientoochenta <= series[4]) {
                            if (valorapagar > cientosetenta) {
                                chequesapagar.add(cientoochenta);
                            }
                            

                        }
                    }
                    if (valorapagar < cientonoventa) {
                        if (cientonoventa <= series[4]) {
                             if (valorapagar > cientoochenta) {
                                 chequesapagar.add(cientonoventa);
                             }
                            
                        }
                    }
                    if (valorapagar < dociento) {
                        if (dociento <= series[4]) {
                            chequesapagar.add(dociento);
                        }
                    }

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
