package org.apache.lens.ml.spark;

import org.apache.lens.ml.spark.FeatureValueMapper;

/**
 * Directly return input when it is known to be double.
 */
public class DoubleValueMapper extends FeatureValueMapper {

  /*
   * (non-Javadoc)
   * 
   * @see org.apache.lens.ml.spark.FeatureValueMapper#call(java.lang.Object)
   */
  @Override
  public final Double call(Object input) {
    return input == null ? 0d : (Double) input;
  }
}
