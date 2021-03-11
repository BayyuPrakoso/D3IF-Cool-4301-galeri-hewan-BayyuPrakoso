package org.d3if4045.galerihewan

class MainAdapter (private val data: List<Hewan>) :
        fun bind(hewan: Hewan) = with(binding) {
            namaTextView.text = hewan.nama
            latinTextView.text = hewan.namaLatin
            imageView.setImageResource(hewan.imageRestId)
        }
