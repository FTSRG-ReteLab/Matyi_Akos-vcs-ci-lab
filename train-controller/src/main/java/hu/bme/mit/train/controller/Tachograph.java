package hu.bme.mit.train.controller;


import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;
import com.sun.javafx.scene.paint.GradientUtils;

import java.util.Date;

/**
 * Created by meres on 2/26/18.
 */
public class Tachograph {
    Table<Date, GradientUtils.Point, Integer> table = HashBasedTable.create();
}
