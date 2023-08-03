package com.jpa.springControl.Repository;

import com.jpa.springControl.domain.Cart;
import com.jpa.springControl.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 카트의 멤버가 표시되어 있는 아이템 목록을 가져와야 한다
    // 그러므로 멤버로 시작되어 멤버에 같은 아이디 값을 가진 아이템 목록을 가져와야 한다
    // 멤버 + 조인 + 카트 가 되는 구도를 만들면 된다
    //
}
