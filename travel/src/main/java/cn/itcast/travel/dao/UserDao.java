package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    /**
     * findByUserName
     * 根据用户查询用户信息
     * @param username
     * @return
     */
    public User findByUserName(String username);

    /**
     * save
     * 保存用户数据
     * @param user
     */
    public void save(User user);

}
