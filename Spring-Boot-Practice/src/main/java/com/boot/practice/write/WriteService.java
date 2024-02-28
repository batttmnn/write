package com.boot.practice.write;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class WriteService {

	private final WriteRepository writeRepository;
	
}
