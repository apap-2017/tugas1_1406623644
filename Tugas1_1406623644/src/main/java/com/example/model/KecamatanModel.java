package com.example.model;

import com.example.model.KotaModel;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KecamatanModel {
	private Integer kecid;
	private Integer id_kota;
    private String kode_kecamatan;
    private String nama_kecamatan;
    private List<KotaModel> kota;
}
