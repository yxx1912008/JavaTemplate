package cn.luckydeer.movie.manager.movie;

import java.util.List;

import cn.luckydeer.movie.dao.movie.daoInterface.IMovieInfoDao;
import cn.luckydeer.movie.dao.movie.dataobject.MovieInfoDo;

public class MovieInfoManager {

    private IMovieInfoDao movieInfoDao;

    /**
     * 
     * 注解：查询所有电影信息
     * @return
     * @author yuanxx @date 2018年6月5日
     */
    public List<MovieInfoDo> getAllMovieInfo() {
        return movieInfoDao.selectAll();
    }

    public void setMovieInfoDao(IMovieInfoDao movieInfoDao) {
        this.movieInfoDao = movieInfoDao;
    }

}
