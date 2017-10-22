package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.*;
import com.example.service.*;
import com.example.mapper.*;


@Controller
public class PendudukController {
	@Autowired
    PendudukService pendudukDAO;
	
	@RequestMapping("/penduduk/view")
    public String view (Model model,
            @RequestParam(value = "nik", required = false) String nik)
    {
        PendudukModel penduduk = pendudukDAO.selectPenduduk (nik);

        if (penduduk != null) {
            model.addAttribute ("penduduk", penduduk);
            return "view";
        } else {
            model.addAttribute ("nik", nik);
            return "not-found";
        }
    }
	
//	@RequestMapping("/penduduk/viewkk")
//    public String viewkk (Model model,
//            @RequestParam(value = "nkk", required = false) String nkk)
//    {
//        PendudukModel penduduk = pendudukDAO.selectPendudukNKK (nkk);
//
//        if (penduduk != null) {
//            model.addAttribute ("penduduk", penduduk);
//            return "viewnkk";
//        } else {
//            model.addAttribute ("nkk", nkk);
//            return "not-found";
//        }
//    }
}
