let chartDataString = decodeHtml(charData);
let chartJsonArray = JSON.parse(chartDataString);
let chartLength = chartJsonArray.length;
let labels = [];
let data = [];
for(let element of chartJsonArray){
    labels.push(element.label);
    data.push(element.value);
}
//pie chart for project stages
new Chart(document.getElementById("myPieChart").getContext('2d'), {
    type: 'pie',
    // The data for our dataset
    data: {
        labels: labels,
        datasets: [{
            label: labels,
            backgroundColor: ["red","green","blue"],
            borderColor: 'rgb(255, 99, 132)',
            data: data
        }]
    },
    options : {
        tooltips: {
            enabled: true
        },
        plugins: {
            datalabels: {
                formatter: (value, ctx) => {
                    let labelsValue;
                    labelsValue  = ctx.dataset.label[ctx.dataIndex]+": "+value;
                    return labelsValue;
                },
                color: '#fff',
            }
        }
    }
});

function decodeHtml(html) {
let txt = document.createElement("textarea");
txt.innerHTML = html;
return txt.value;
}

