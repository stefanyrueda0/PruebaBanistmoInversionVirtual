package com.pruebas.banistmo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Navegacion {

public static Target SOLICITAR_PRODUCTOS= Target.the("Solicitar productos").located(By.xpath("//*[@id=\"header-solicitud-productos\"]"));
public static Target INVERSIONES= Target.the("Inversiones Virtuales").located(By.xpath("//*[@id=\"filtro-inversiones\"]"));
public static  Target MONTO=Target.the("monto").located(By.xpath("//*[@id=\"tag-catMontoMinimo500000 icon-cash\"]"));
public static Target OPCIONES_MONTO=Target.the("Opciones monto").located(By.xpath("//*[@id=\"mostrar-filtros\"]"));
public static Target CONOCE_MAS=Target.the("Opciones monto").located(By.xpath("//*[@id=\"filtrado-conoce-inversion-0\"]"));

}
