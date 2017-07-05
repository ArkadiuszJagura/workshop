package pl.kodolamacz.service;

import pl.kodolamacz.dao.SparePartDao;
import pl.kodolamacz.dao.WarehouseDao;

/**
 * Created by Jag on 2017-07-04.
 */

@Service
public class WarehouseService {


    @Autowired
    private WarehouseDao warehouseDao;

    public void setWarehouseDao(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }


    @Autowired
    private SparePartDao sparePartDao;

    public void setSparePartDao(SparePartDao sparePartDao) {
        this.sparePartDao = sparePartDao;
    }


}
