package com.tracy.demo.dao;

import com.tracy.demo.entity.TLuckyDrawPrizeConfig;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PrizeConfigRepository extends PagingAndSortingRepository<TLuckyDrawPrizeConfig, String>, JpaSpecificationExecutor<TLuckyDrawPrizeConfig> {
	public TLuckyDrawPrizeConfig findByPrizeKey(String prizeKey);
	public List<TLuckyDrawPrizeConfig> findByPrizeKeyIn(List<String> prizeKeys);
	public List<TLuckyDrawPrizeConfig> findByType(String type);
	public List<TLuckyDrawPrizeConfig> findByPrizeKeyStartingWith(String type);
	public List<TLuckyDrawPrizeConfig> findByPrizeKeyLike(String type);
}
