package com.map_dump.controller;

import com.map_dump.model.dsect.Dsect;
import com.map_dump.model.map.MappedDsect;

/**
 * Created by Roman Sofyin on 16.12.2016.
 */
public interface IDumpMapper {
	MappedDsect map(Dsect dsect, String hexStr);
}
