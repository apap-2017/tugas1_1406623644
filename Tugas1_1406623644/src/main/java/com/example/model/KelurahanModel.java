package com.example.model;

import com.example.model.KecamatanModel;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KelurahanModel {
	private Integer rahid;
	private Integer id_kecamatan;
    private String kode_kelurahan;
    private String nama_kelurahan;
    private String kode_pos;
    private List<KecamatanModel> kecamatan;
}
