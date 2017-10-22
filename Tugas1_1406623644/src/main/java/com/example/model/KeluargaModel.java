package com.example.model;

import com.example.model.KelurahanModel;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeluargaModel {
	private Integer kelid;
	private String nomor_kk;
    private String alamat;
    private String rt;
    private String rw;
    private Integer id_kelurahan;
    private Integer is_tidak_berlaku;
    private List<KelurahanModel> kelurahan;
}
