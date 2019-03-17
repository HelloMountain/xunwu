/**
 * Created by 瓦力.
 */

var tipStr = '<option value="">请选择</option>';

function showError(message) {
    layer.msg("Error: " + message, {icon: 5, time: 2000});
}

function changeCity(city) {

    $.get('/address/support/cities', function (data, status) {
        if (status !== 'success' || data.code !== 200) {
            showError(data.message);
            return;
        }

        city.html(tipStr);
        var str = '';
        var j = 0;
        $.each(data.data, function (i, item) {
            if (j === 1) {
                for (var k = 0, len = item.length; k < len; k++) {
                    str += "<option value=" + item[k].en_name + ">" + item[k].cn_name + "</option>";
                }
            }
            j++;
        });
        city.append(str);
    });
}

function changeRegion(region, cityName) {
    $.get('/address/support/regions?city_name=' + cityName, function (data, status) {
        if (status !== 'success' || data.code !== 200) {
            showError(data.message);
            return;
        }
        var selectedVal = region.val();
        region.html(tipStr);

        var str = "";
        $.each(data.data, function (i, item) {
            if (i == "result" && item.length > 0) {
                for (var k = 1, len = item.length; k < len; k++) {
                    if (item[k].en_name === selectedVal) {
                        str += "<option value=" + item[k].en_name + " selected='selected'>" + item[k].cn_name + "</option>";
                    } else {
                        str += "<option value=" + item[k].en_name + ">" + item[k].cn_name + "</option>";
                    }
                }
            }
        });
        region.append(str);
    });
}

function changeSubwayLine(subwayLine, cityName) {
    $.get('/address/support/subway/line?city_name=' + cityName, function (data, status) {
        if (status !== 'success' || data.code !== 200) {
            showError(data.message);
            return;
        }
        subwayLine.html(tipStr);
        var str = "";
        // $.each(data.data, function (index, subway) {
        //     // for (var k = 0 && index === "result", len = subway.length; k < len; k++) {
        //         str += "<option value=" + subway.id + ">" + subway.name + "</option>";
        //     // }
        // });
        $.each(data.data.result, function(i, n){
            str += "<option value=" + n.id + ">" + n.name + "</option>";
        });
        subwayLine.append(str);
    })
}

function changeSubwayStation(subwayStation, subwayLineId) {
    $.get('/address/support/subway/station?subway_id=' + subwayLineId, function (data, status) {
        if (status !== 'success' || data.code !== 200) {
            showError(data.message);
            return;
        }

        subwayStation.html(tipStr);
        var str = "";
        $.each(data.data.result, function (index, station) {
            str += "<option value=" + station.id + ">" + station.name + "</option>";
        });
        subwayStation.append(str);
    })
}