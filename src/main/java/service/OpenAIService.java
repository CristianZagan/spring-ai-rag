package service;

import model.Answer;
import model.Question;

public interface OpenAIService {

    Answer getAnswer(Question question);
}
