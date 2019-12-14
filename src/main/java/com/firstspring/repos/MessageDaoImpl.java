package com.firstspring.repos;

import com.firstspring.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MessageDaoImpl implements MessageDao{
    @Autowired
    MessageRepo messageRepo;

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Message> findMessageByTagContains(String tag) {
        return messageRepo.findMessageByTagContains(tag);
    }

    @Override
    public List<Message> findMessageByTextContains(String text) {
        return messageRepo.findMessageByTextContains(text);
    }

    @Override
    public Message findMessageById(Integer id) {
        return messageRepo.findMessageById(id);
    }

    @Override
    public List<Message> findMessageByTextAndTagContains(String text) {
        //select * from firstspring.message where tag like '%av%' or text like '%av%';
        //return entityManager.createNativeQuery("SELECT client_email FROM client_emails").getResultList();
        String queryString = new StringBuilder("select * from firstspring.message where tag like '%").append(text).append("%' or text like '%").append(text).append("%'").toString();
       // TypedQuery<Message> typedQuery = em.createq
        List<Message> list = em.createNativeQuery(queryString, Message.class).getResultList();
        return list;
    }
}
