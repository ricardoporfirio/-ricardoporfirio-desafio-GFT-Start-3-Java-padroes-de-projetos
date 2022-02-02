package br.com.ricardoporfirio.padrosdeprojetos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ricardoporfirio.padrosdeprojetos.model.Log;
import br.com.ricardoporfirio.padrosdeprojetos.service.LogService;

@RestController
@RequestMapping("logs")
public class LogController {

	@Autowired
	private LogService logService;

    @GetMapping
	public ResponseEntity<Iterable<Log>> buscarTodos() {
		return ResponseEntity.ok(logService.buscarTodos());
	}
}
