package com.firstspring.repos;

import com.firstspring.domain.Message;

import java.util.List;

public interface MessageDao {
    List<Message> findMessageByTagContains(String tag);
    List<Message> findMessageByTextContains(String text);
    Message findMessageById(Integer id);
    List<Message> findMessageByTextAndTagContains(String text);
}
