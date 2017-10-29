package com.ahmed.kotlin_mvp_rx_di_retrofit_android_sample.data.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Ahmed Kamal on 29-10-2017.
 */
// Data Class responsible for holding data
data class Joke (val Id : Int , val joke : String) : Parcelable
{
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(Id)
        parcel.writeString(joke)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        @JvmField val CREATOR: Parcelable.Creator<Joke> = object : Parcelable.Creator<Joke> {
            override fun createFromParcel(parcelIn: Parcel): Joke {
                return Joke(parcelIn.readInt(), parcelIn.readString())
            }

        override fun newArray(size: Int): Array<Joke?> {
            return arrayOfNulls(size)
        }
    }


    }
}