package academy.devdojo.maratonajava.javacore.ZZIjdbc.listener;

import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

@Log4j2
public class CustomRowListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Command execute triggered"); // Quando o comando execute é ativado
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Row inserted, updated or deleted"); // Quando alguma operação no banco de dados é feita
        if (event.getSource() instanceof RowSet){
            try {
                ((RowSet)event.getSource()).execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("Cursor moved"); // Quando o cursor é movido
    }
}
