package com.example.pml1_recycleview.model

class Datamodel {

    var image: Int? = 0
    var title: String? = null
    var harga: String? = null
    constructor(gambar: Int?, judul: String?, harga : String) {
        this.image = gambar
        this.title = judul
        this.harga = harga
    }
}