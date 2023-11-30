package com.MyBlogApplication.Repository;

import com.MyBlogApplication.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.management.jdp.JdpPacket;

public interface PostRepository extends JpaRepository<Post,Long> {
}
