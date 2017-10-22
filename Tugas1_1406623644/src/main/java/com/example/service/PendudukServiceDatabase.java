package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.*;
import com.example.model.*;

import lombok.extern.slf4j.Slf4j;


@Service
public class PendudukServiceDatabase implements PendudukService
{
    @Autowired
    private PendudukMapper pendudukMapper;
    private KeluargaMapper keluargaMapper;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PendudukServiceDatabase.class);
    @Override
    public PendudukModel selectPenduduk (String nik)
    {
        log.info ("select penduduk with nik {}", nik);
        return pendudukMapper.selectPenduduk (nik);
    }
    
//	public PendudukModel selectPendudukNKK(String nkk) {
//		log.info ("select penduduk based on nkk {}", nkk);
//		PendudukModel tmp = pendudukMapper.selectPendudukNKK (nkk);
//		keluargaMapper.selectId(tmp.getId_keluarga());
//		return pendudukMapper.selectPendudukNKK (nkk);
//	}

}