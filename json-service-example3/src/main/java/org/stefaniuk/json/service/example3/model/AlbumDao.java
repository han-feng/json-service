package org.stefaniuk.json.service.example3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AlbumDao extends AbstractModelDao<Album> {

    @Override
    public Integer create(Album model) {

        return null;
    }

    @Override
    public Integer update(Album model) {

        return null;
    }

    @Override
    public Integer update(Album model, Album changed) {

        return null;
    }

    @Override
    public Integer remove(Album model) {

        return null;
    }

    @Override
    public List<Album> findAll() {

        List<Album> list = new ArrayList<Album>();

        String sql = String.format("select * from Album");
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        for(Map<String, Object> row: rows) {
            // TODO
            //list.add(new Album(row));
        }

        return list;
    }

    @Override
    public Album findById(Integer id) {

        return null;
    }

    @Override
    public Integer findIdByModel(Album model) {

        return null;
    }

    @Override
    public Integer countAll() {

        return null;
    }

}
