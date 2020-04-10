package com.phoenixapps.intents.model

import android.os.Parcel
import android.os.Parcelable

class Person(name: String) : Parcelable {
    var name: String? = null

    init {
        this.name = name
    }

    constructor(parcel: Parcel) : this(parcel.readString().run {
        if (this == null) return@run "No name? Huh?"
        return@run this
    })

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }

}