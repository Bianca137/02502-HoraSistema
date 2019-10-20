/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        //Primera forma
        
        System.out.println("Hora del sistema.......: " + cal.get(cal.HOUR_OF_DAY) + ":" + cal.get(cal.MINUTE) + ":" + cal.get(cal.SECOND));
        //d.getTime();

        //segunda forma
        
        //Variables 
        //int h; //horas
        //int m; //minutos
        //int s; //segundos
        //Objeto GregorianCalendar
        //Calendar cal = Calendar.getInstance();
        // Obtener valores
        //System.out.println(Calendar.HOUR_OF_DAY); //VEr esta forma de la hora con las `posiciones.
        //h = cal.get(Calendar.HOUR_OF_DAY); //su posicion es 11
        //m = cal.get(Calendar.MINUTE);      //posicion 12 //m = cal.get(12);
        //s = cal.get(Calendar.SECOND);      //posicion 13 // con estos valores me tendria que salir lo mismo que con poner "HOUR_OF_DAY, MINUTE Y SECOND)
        //Mensaje
        //System.out.printf("Hora del sistema.....args: %02d:%02d:%02d%n", h, m, s);
        
        //tercera forma
        
        System.out.printf("Hora del sistema.....args: %02d:%02d:%02d%n", cal.get(cal.HOUR_OF_DAY), cal.get(cal.MINUTE), cal.get(cal.SECOND));

        //otra alternativa es utilziando Gregorian Calendar, es clase hija de Calendar
        // Calendar cal = new GregorianCalendar();
        //otra forma de sacar la hora pero con esta forma no puedo controlar los 4 digitos del año, solo salen 2
        // final Locale LCL = new Locale("es", "ES");   //es-region ES -idioma
        //final DateFormat DF = DateFormat.getDateInstance(DateFormat.LONG, LCL);
        //Date d = new Date();
        //System.out.println(DF.format(d));
        //tercera forma
        //public static final SimpleDateFormat SDF = new SimpleDateFormat();	
        //public static final String PATRON_FECHA_CORTA = "dd/MM/yyyy"; ((( para poner en españos la fecha, new Locale("es", "ES");
        //SDF.applyPattern(PATRON_FECHA_CORTA);
        //Date d = new Date();
        //System.out.println(SDF.format(cal.getTime()));
        //otra alternatuva printf("%td/%tm/ty....
    }

}
