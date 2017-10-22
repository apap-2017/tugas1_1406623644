package com.example.mapper;

import java.util.List;

import com.example.model.*;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Many;

//nik, nama, tempat_lahir, tanggal_lahir, jenis_kelamin, is_wni, id_keluarga, agama, pekerjaan, status_perkawinan, status_dalam_keluarga, golongan_darah, is_wafat
@Mapper
public interface PendudukMapper {
	 @Select("select * from penduduk where nik = #{nik}")
	 @Results(value = {
			    @Result(property="penid", column="id"),
			    @Result(property="nik", column="nik"),
			    @Result(property="nama", column="nama"),
			    @Result(property="tempat_lahir", column="tempat_lahir"),
			    @Result(property="tanggal_lahir", column="tanggal_lahir"),
			    @Result(property="jenis_kelamin", column="jenis_kelamin"),
			    @Result(property="is_wni", column="is_wni"),
			    @Result(property="id_keluarga", column="id_keluarga"),
			    @Result(property="agama", column="agama"),
			    @Result(property="pekerjaan", column="pekerjaan"),
			    @Result(property="status_perkawinan", column="status_perkawinan"),
			    @Result(property="status_dalam_keluarga", column="status_dalam_keluarga"),
			    @Result(property="golongan_darah", column="golongan_darah"),
			    @Result(property="is_wafat", column="is_wafat")
	    	})
	 PendudukModel selectPenduduk (@Param("nik") String nik);
	 
//	 @Select("select K.id, K.nomor_kk, K.alamat, K.rt, K.rw, L.nama_kelurahan, C.nama_kecamatan, N.nama_kota, P.nama, P.nik, "
//	 		+ "P.jenis_kelamin, P.tempat_lahir, P.tanggal_lahir, P.agama, P.pekerjaan, P.status_perkawinan, P.status_dalam_keluarga, P.is_wni"
//	 		+ " from penduduk P, keluarga K , kelurahan L, kecamatan C, kota N where P.id_keluarga = K.id AND "
//	 		+ "K.id_kelurahan = L.id"
//	 		+ " AND L.id_kecamatan = C.id AND C.id_kota = N.id AND K.id = #{nkk}")
//		@Results(value = {
//				@Result(property="K.id", column="kid"),
//				@Result(property="K.nomor_kk", column="nomor_kk"),
//				@Result(property="K.alamat", column="alamat"),
//				@Result(property="K.rt", column="rt"),
//				@Result(property="K.rw", column="rw"),
//				@Result(property="L.nama_kelurahan", column="nama_kelurahan"),
//				@Result(property="C.nama_kecamatan", column="nama_kecamatan"),
//				@Result(property="N.nama_kota", column="nama_kota"),
//				@Result(property="P.nama", column="nama"),
//				@Result(property="P.nik", column="nik"),
//				@Result(property="P.jenis_kelamin", column="jenis_kelamin"),
//				@Result(property="P.tempat_lahir", column="tempat_lahir"),
//				@Result(property="P.tanggal_lahir", column="tanggal_lahir"),
//				@Result(property="P.agama", column="agama"),
//				@Result(property="P.pekerjaan", column="pekerjaan"),
//				@Result(property="P.status_perkawinan", column="status_perkawinan"),
//				@Result(property="P.status_dalam_keluarga", column="status_dalam_keluarga"),
//				@Result(property="P.is_wni", column="is_wni")
//		})
////	 List<KeluargaModel> selectPendudukNKK ();
//	 PendudukModel selectPendudukNKK(@Param("nkk") String nkk);
	 
	 
	 
	 
	 
	 @Select("select * from penduduk where id_keluarga = #{nkk}")
	 @Results(value = {
			    @Result(property="penid", column="id"),
			    @Result(property="nik", column="nik"),
			    @Result(property="nama", column="nama"),
			    @Result(property="tempat_lahir", column="tempat_lahir"),
			    @Result(property="tanggal_lahir", column="tanggal_lahir"),
			    @Result(property="jenis_kelamin", column="jenis_kelamin"),
			    @Result(property="is_wni", column="is_wni"),
			    @Result(property="id_keluarga", column="id_keluarga"),
			    @Result(property="agama", column="agama"),
			    @Result(property="pekerjaan", column="pekerjaan"),
			    @Result(property="status_perkawinan", column="status_perkawinan"),
			    @Result(property="status_dalam_keluarga", column="status_dalam_keluarga"),
			    @Result(property="golongan_darah", column="golongan_darah"),
			    @Result(property="is_wafat", column="is_wafat")
	    	})
	 PendudukModel selectPendudukNKK (@Param("nkk") String nik);
}
