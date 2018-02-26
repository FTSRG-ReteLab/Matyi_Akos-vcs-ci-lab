package hu.bme.mit.train.sensor;


import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;
import com.sun.javafx.scene.paint.GradientUtils;

import java.util.Date;

/**
 * Created by meres on 2/26/18.
 */
public class Tachograph {
    Table<Date, GradientUtils.Point, Integer> table;

    public Tachograph(){
        table = HashBasedTable.create();
    }

    public void addElement(){
        table.put(new Date(), new GradientUtils.Point(), 10);
    }

    public int getCount(){
        return table.size();
    }
}
