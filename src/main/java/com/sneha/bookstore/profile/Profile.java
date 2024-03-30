package com.sneha.bookstore.profile;/* Created by narendra on 29/03/24 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
    @Value("${message}")
    private String message;
    public String getMessage() {
        return message;
    }
}
