package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;

import java.io.File;

public interface Exportable {

    File toPdf(String texto);
    File toMd(String texto);
    File toHtml(String texto);
    File toDocx(String texto);
    File toOdt(String texto);
}
