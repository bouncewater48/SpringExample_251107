package com.bounce.springexample.database.repasitory;

import com.bounce.springexample.database.domain.UsedGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// Mybatis Framework
@Mapper
public interface UsedGoodsRepository {


    // used_goods 모든 행 조회
    public List<UsedGoods> selectUsedGoodsList();


}
