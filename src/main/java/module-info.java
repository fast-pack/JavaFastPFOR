// Copyright (C) 2022 Intel Corporation

// SPDX-License-Identifier: Apache-2.0
module me.lemire.integercompression {
  // Optional at runtime: only consumers of the vector package (VectorFastPFOR)
  // need jdk.incubator.vector resolved (e.g. --add-modules jdk.incubator.vector).
  // Scalar consumers resolve without it.
  requires static jdk.incubator.vector;
  exports me.lemire.integercompression;
  exports me.lemire.longcompression;
  exports me.lemire.longcompression.differential;
  exports me.lemire.integercompression.differential;
  exports me.lemire.integercompression.vector;
}
