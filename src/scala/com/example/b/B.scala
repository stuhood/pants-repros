package com.example.b

import com.example.a.A

trait B {
  def create: A.type = A

  def empty: String
}
