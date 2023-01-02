package com.example.tokendemo.controller;

import com.example.tokendemo.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/boards")
public class BoradController {

    @GetMapping
    public ResponseEntity<List<Board>> list()
    {
        log.info("========list");

        List<Board> boardList = new ArrayList<>();

        Board board = new Board();

        board.setBoardNo(1L);
        board.setTitle("안녕하세요?");
        board.setContent("안녕하세요 xxx입니다. 잘부탁드려요!");
        board.setWiter("차현호");
        board.setRegDate(LocalDateTime.now());

        boardList.add(board);


        board.setBoardNo(2L);
        board.setTitle("ㅋㅋㅋㅋㅋ");
        board.setContent("안녕하세요 xxx입니다. 잘부탁드려요!");
        board.setWiter("차현순");
        board.setRegDate(LocalDateTime.now());

        boardList.add(board);

        ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList, HttpStatus.OK);

        return entity;
    }
    @PostMapping
    public ResponseEntity<String> register(@RequestBody Board board)
    {
        log.info("==========register");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> read(@PathVariable("boardNo") Long boardNo)
    {
        log.info("==========register");

        Board board2 = new Board();

        board2.setBoardNo(1L);
        board2.setTitle("안녕하세요?");
        board2.setContent("안녕하세요 xxx입니다. 잘부탁드려요!");
        board2.setWiter("차현호");
        board2.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<>(board2, HttpStatus.OK);

        return entity;
    }

    @DeleteMapping("/{boardNo}")
    public ResponseEntity<String> remove(@PathVariable("boardNo") Long boardNo)
    {
        log.info("==========remove");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);

        return entity;
    }


}
