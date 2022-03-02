package testbean;
import encripta.Encripta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import writer.Writer;

import java.util.Locale;

public class MySpringWriterBeanWithDependency {
    private Encripta encripta;

    @Autowired
    public void setEncriptar (Encripta encripta){
        this.encripta = encripta;
    }

    public void run(){
        String s = "HOLA MUNDO";
        String result = encripta.encripta(s.toUpperCase());
        encripta.desencripta(result.toUpperCase());
    }
}
