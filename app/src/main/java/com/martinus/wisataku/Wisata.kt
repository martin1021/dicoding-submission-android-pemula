package com.martinus.wisataku

import java.io.Serializable

data class Wisata(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Serializable