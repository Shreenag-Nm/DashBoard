// src/components/D3Chart.js
import React, { useEffect, useRef } from 'react';
import * as d3 from 'd3';

const D3Chart = ({ data }) => {
  const chartRef = useRef(null);

  useEffect(() => {
    if (data && data.length > 0) {
      const svg = d3.select(chartRef.current)
        .attr('width', 1000)
        .attr('height', 500);

      // Clear previous chart content
      svg.selectAll('*').remove();

      const margin = { top: 20, right: 30, bottom: 40, left: 40 };
      const width = +svg.attr('width') - margin.left - margin.right;
      const height = +svg.attr('height') - margin.top - margin.bottom;
      const g = svg.append('g').attr('transform', `translate(${margin.left},${margin.top})`);

      const x = d3.scaleBand().rangeRound([0, width]).padding(0.1);
      const y = d3.scaleLinear().rangeRound([height, 0]);

      x.domain(data.map(d => d.topic));
      y.domain([0, d3.max(data, d => d.intensity)]);

      g.append('g')
        .attr('class', 'axis axis--x')
        .attr('transform', `translate(0,${height})`)
        .call(d3.axisBottom(x))
        .selectAll('text')
        .attr('transform', 'rotate(-45)')
        .style('text-anchor', 'end');

      g.append('g')
        .attr('class', 'axis axis--y')
        .call(d3.axisLeft(y).ticks(10, 'd'));

      g.selectAll('.bar')
        .data(data)
        .enter().append('rect')
        .attr('class', 'bar')
        .attr('x', d => x(d.topic))
        .attr('y', d => y(d.intensity))
        .attr('width', x.bandwidth())
        .attr('height', d => height - y(d.intensity))
        .attr('fill', 'steelblue');
    }
  }, [data]);

  return (
    <svg ref={chartRef}></svg>
  );
};

export default D3Chart;
